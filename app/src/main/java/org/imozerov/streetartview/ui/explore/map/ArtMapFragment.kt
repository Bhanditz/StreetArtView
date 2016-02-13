package org.imozerov.streetartview.ui.explore.map


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.imozerov.streetartview.R
import org.imozerov.streetartview.StreetArtViewApp
import org.imozerov.streetartview.ui.explore.interfaces.Filterable

/**
 * A simple [Fragment] subclass.
 * Use the [ArtMapFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ArtMapFragment : Fragment(), Filterable {
    override fun applyFilter(queryToApply: String) {
        // TODO
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_art_map, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        val refWatcher = StreetArtViewApp.getRefWatcher(activity);
        refWatcher.watch(this);
    }

    companion object {
        fun newInstance(): ArtMapFragment {
            val fragment = ArtMapFragment()
            return fragment
        }
    }

}
