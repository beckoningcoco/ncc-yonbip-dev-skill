# |<<

**业务分类 (org_sscbusinessunittype / nc.vo.ssc.task.businessunittype.BusinessUnitTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4168.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiunit | 业务分类主键 | pk_busiunit | char(20) | √ | 主键 (UFID) |
| 2 | code | 业务分类编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 业务分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_ssctype | 共享服务类型主键 | pk_ssctype | varchar(20) |  | 共享服务分类 (ssctype) |
| 5 | typeidx | 业务分类索引（共享服务委托关系业务分类） | typeidx | varchar(50) |  | 字符串 (String) |