# |<<

**需求跟踪处理树节点 (mm_dttreenode / nc.vo.mmdp.dt.entity.DTTreeNodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3669.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | vnode | 节点编号 | vnode | varchar(50) | √ | 字符串 (String) |
| 2 | vparentnode | 父节点编号 | vparentnode | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(181) |  | 字符串 (String) |
| 7 | fbilltype | 单据类型 | fbilltype | int |  | 单据类型 (DTDocTypeEnum) |  | 0=存量; |