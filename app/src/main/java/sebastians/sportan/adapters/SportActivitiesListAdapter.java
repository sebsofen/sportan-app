package sebastians.sportan.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.apache.thrift.protocol.TMultiplexedProtocol;

import java.util.ArrayList;
import java.util.List;

import sebastians.sportan.R;
import sebastians.sportan.app.MyCredentials;
import sebastians.sportan.networking.Area;
import sebastians.sportan.networking.AreaSvc;
import sebastians.sportan.networking.ServiceConstants;
import sebastians.sportan.networking.SportActivity;
import sebastians.sportan.networking.SportActivitySvc;
import sebastians.sportan.tasks.CustomAsyncTask;
import sebastians.sportan.tasks.TaskCallBacks;
import sebastians.sportan.tasks.caches.AreasCache;

/**
 * Created by sebastian on 10/01/16.
 */
public class SportActivitiesListAdapter extends ArrayAdapter<String> {
    Context context;
    ArrayList<String> activitiesList;
    public SportActivitiesListAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.activitiesList = (ArrayList<String>) objects;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.sport_activities_item, parent, false);
        //TODO set all views and stuff
        final String sportActivityId =activitiesList.get(position);
        final TextView who_txt = (TextView) view.findViewById(R.id.who_txt);
        final TextView when_txt = (TextView) view.findViewById(R.id.when_txt);
        final TextView host_txt = (TextView) view.findViewById(R.id.host_txt);
        final TextView location_txt = (TextView) view.findViewById(R.id.location_txt);

        final CustomAsyncTask getSportActivityTask = new CustomAsyncTask(context);
        getSportActivityTask.setTaskCallBacks(new TaskCallBacks() {
            SportActivity sportActivity;
            Area area;
            @Override
            public String doInBackground() {
                TMultiplexedProtocol mp;
                try {
                    MyCredentials myCredentials = new MyCredentials(context);
                    mp = getSportActivityTask.openTransport(ServiceConstants.SERVICE_SPORTACTIVITY);
                    SportActivitySvc.Client client = new SportActivitySvc.Client(mp);
                    sportActivity = client.getActivity(myCredentials.getToken(),sportActivityId);
                    getSportActivityTask.closeTransport();

                    area = AreasCache.get(sportActivity.getArea());

                    if(area == null) {
                        mp = getSportActivityTask.openTransport(ServiceConstants.SERVICE_AREA);
                        AreaSvc.Client areaClient = new AreaSvc.Client(mp);
                        area = areaClient.getAreaById(myCredentials.getToken(), sportActivity.getArea());
                        getSportActivityTask.closeTransport();
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public void onPreExecute() {

            }

            @Override
            public void onPostExecute() {
                location_txt.setText(area.getTitle());

            }
        });
        getSportActivityTask.execute();
        return view;

    }
}
