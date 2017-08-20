package org.jfrog.artifactory.client.model.impl;

import org.jfrog.artifactory.client.model.PackageType;

public enum PackageTypeImpl implements PackageType {
    bower,
    cocoapods,
    debian,
    distribution,
    docker,
    gems,
    generic,
    gitlfs,
    gradle,
    ivy,
    maven,
    npm,
    nuget,
    opkg,
    p2,
    pypi,
    sbt,
    vagrant,
    vcs,
    yum,
    rpm,
    composer,
    conan,
    chef,
    puppet;

    @Override
    public boolean isCustom() {
        return false;
    }
}
