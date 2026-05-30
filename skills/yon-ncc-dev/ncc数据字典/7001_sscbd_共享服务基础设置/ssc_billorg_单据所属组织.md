# |<<

**单据所属组织 (ssc_billorg / nc.vo.ssc.task.allotrule.SSCBillOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5506.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sscbillorg | 主键 | pk_sscbillorg | char(20) | √ | 主键 (UFID) |
| 2 | pk_allotrule_b | 分配规则明细主键 | pk_allotrule_b | varchar(50) |  | 字符串 (String) |
| 3 | pk_billorg | 单据所属组织 | pk_billorg | varchar(50) |  | 字符串 (String) |
| 4 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 5 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 7 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |