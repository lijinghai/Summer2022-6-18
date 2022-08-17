package priv.ljh;

import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.IndicesClient;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import priv.ljh.dao.Content;

import java.io.IOException;

@SpringBootTest
class ElasticsearchApiApplicationTests {

    @Autowired
    /*@Qualifier("restHighLevelClient")*/
    private RestHighLevelClient restHighLevelClient;

    // 创建索引的创建 Request
    @Test
    void testCreateIndex() throws IOException {
        // 1.创建索引请求
        CreateIndexRequest request = new CreateIndexRequest("lijinghai_index1");
        // 2.执行请求
        CreateIndexResponse createIndexResponse =
                restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse);
    }


    @Test
    void testAddDoc() throws IOException {
        // 创建对象
        Content content = new Content("11", "22", "33");
         // 创建请求
        IndexRequest request = new IndexRequest("lijinghai_index");

        // 规则 put:/ lijinghai_index1/_doc/1
        request.id("1");
        request.timeout(TimeValue.timeValueSeconds(1));
        request.timeout("1s");

        request.source(JSON.toJSON(content), XContentType.JSON);

        // 客户端发送请求
        IndexResponse indices = restHighLevelClient.index(request, RequestOptions.DEFAULT);

        System.out.println(indices.toString());
        System.out.println(indices.status());

    }


}
