package com.eightydegreeswest.bfmgr.service.impl;

import com.amazonaws.services.ec2.model.KeyPairInfo;
import com.amazonaws.services.ec2.model.SecurityGroup;
import com.amazonaws.services.ec2.model.Subnet;
import com.eightydegreeswest.bfmgr.model.BuildfarmCluster;
import com.eightydegreeswest.bfmgr.model.CreateClusterRequest;
import com.eightydegreeswest.bfmgr.service.BfMgrCtrl;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class BfMgrCtrlGcp implements BfMgrCtrl {
  private static final Logger logger = LoggerFactory.getLogger(BfMgrCtrlGcp.class);

  @Override
  public List<BuildfarmCluster> getBuildfarmClusters() {
    throw new UnsupportedOperationException();
  }

  @Override
  @Async
  public void createCluster(CreateClusterRequest createClusterRequest) {
    throw new UnsupportedOperationException();
  }

  @Override
  @Async
  public void terminateCluster(String clusterName) {
    throw new UnsupportedOperationException();
  }

  @Override
  public CreateClusterRequest getDefaultCreateClusterRequest() {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<Subnet> getSubnets() {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<SecurityGroup> getSecurityGroups() {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<KeyPairInfo> getKeyNames() {
    return new ArrayList<>();
  }
}
