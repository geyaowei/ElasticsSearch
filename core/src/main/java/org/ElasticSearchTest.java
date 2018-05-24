package org;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class ElasticSearchTest {

	public static void main(String[] args) throws UnknownHostException {
		Settings settings = Settings.builder().put("cluster.name", "application").build();
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
		System.out.println(client.nodeName());
				

	}

}
