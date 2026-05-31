# |<<

**资源类型和层次类型的对照关系 (pub_psn_matrix / nc.vo.pub.personalization.PersonalizationMatrixVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4763.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matrix | 主键 | pk_matrix | char(20) | √ | 主键 (UFID) |
| 2 | pk_resourcetype | 资源类型 | pk_resourcetype | varchar(20) |  | 资源类型 (personalizationResource) |
| 3 | leveltype | 层次类型 | leveltype | int |  | 层次类型 (leveltype) |  | 1=全局; |