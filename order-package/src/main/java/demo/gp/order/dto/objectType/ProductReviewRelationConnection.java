package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.objectType.PageInfo;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class ProductReviewRelationConnection {
  private Integer totalCount;

  private PageInfo pageInfo;

  private Collection<ProductReviewRelationEdge> edges;

  public Integer getTotalCount() {
    return this.totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public PageInfo getPageInfo() {
    return this.pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  public Collection<ProductReviewRelationEdge> getEdges() {
    return this.edges;
  }

  public void setEdges(Collection<ProductReviewRelationEdge> edges) {
    this.edges = edges;
  }
}
