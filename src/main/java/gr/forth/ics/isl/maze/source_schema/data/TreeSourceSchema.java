/*
 * Copyright 2015 Institute of Computer Science,
 * Foundation for Research and Technology - Hellas
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at: http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 *
 * Contact:  POBox 1385, Heraklio Crete, GR-700 13 GREECE
 * Tel:+30-2810-391632 Fax: +30-2810-391638 E-mail: isl@ics.forth.gr http://www.ics.forth.gr/isl
 *
 * Authors : Anyfantis Nikolaos (nanifant 'at' ics 'dot' forth 'dot' gr)
 *
 * This file is part of the Mapping Analyze (Maze) app.
 */
package gr.forth.ics.isl.maze.source_schema.data;

import gr.forth.ics.isl.maze.Utils.Utils;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Anyfantis Nikos (nanifant 'at' ics 'dot' forth 'dot' gr)
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "root",
    "allParentNames",
    "allLeavesNames"
})
@XmlRootElement(name = "TreeSourceSchema")
public class TreeSourceSchema {
    
    private TreeBranchSourceSchema root;
    private ArrayList<String> allParentNames;
    private ArrayList<String> allLeavesNames;

    public ArrayList<String> getAllLeavesNames() {
        return allLeavesNames;
    }

    public void setAllLeavesNames(ArrayList<String> allLeavesNames) {
        this.allLeavesNames = allLeavesNames;
    }
    
    public void addLeafName(String name){
        if(allLeavesNames==null){
            allLeavesNames = new ArrayList<>();
        }
        allLeavesNames.add(name);
        allLeavesNames = Utils.removeDublicatesFromArrayList(allLeavesNames);
    }

    public ArrayList<String> getAllParentNames() {
        return allParentNames;
    }

    public void setAllParentNames(ArrayList<String> allParentNames) {
        this.allParentNames = allParentNames;
    }
    
    public void addParentName(String name){
        if(allParentNames==null){
            allParentNames = new ArrayList<>();
        }
        allParentNames.add(name);
        allParentNames = Utils.removeDublicatesFromArrayList(allParentNames);
    }

    public TreeBranchSourceSchema getRoot() {
        return root;
    }

    public void setRoot(TreeBranchSourceSchema root) {
        this.root = root;
    }
    
    
}
