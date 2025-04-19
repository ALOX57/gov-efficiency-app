package com.example.govefficiencyapp.tree;


import com.example.govefficiencyapp.domain.Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents one node in the tree, holding apps for a specific date.
 */
public class TreeNode {
    public LocalDate keyDate;
    public List<Application> applications;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(LocalDate keyDate) {
        this.keyDate = keyDate;
        this.applications = new ArrayList<>();
        this.left = null;
        this.right = null;
    }
}
