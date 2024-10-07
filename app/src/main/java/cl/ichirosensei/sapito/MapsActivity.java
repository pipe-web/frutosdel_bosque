package cl.ichirosensei.sapito;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.ichirosensei.sapito.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;




        // Add a marker in Sydney and move the camera
        LatLng platano = new LatLng(-36.58986490591673, -72.08208785277378);
        mMap.addMarker(new MarkerOptions().position(platano).title("Marker in platano"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(platano));
        LatLng Duraznos = new LatLng(-36.592506406703606, -72.08977341712867);
        mMap.addMarker(new MarkerOptions().position(Duraznos).title("Marker in New Durazno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Duraznos));
        LatLng Manzanos = new LatLng(-36.593240268137144, -72.09229461062621);
        mMap.addMarker(new MarkerOptions().position(Manzanos).title("Marker in Manzanos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Manzanos));
        LatLng Naranjas = new LatLng(-36.594516440030475, -72.09204153102388);
        mMap.addMarker(new MarkerOptions().position(Naranjas).title("Marker in Naranjas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Naranjas));


    }
}
