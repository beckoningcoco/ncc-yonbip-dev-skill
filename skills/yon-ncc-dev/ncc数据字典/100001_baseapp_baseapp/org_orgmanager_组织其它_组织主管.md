# |<<

**组织其它_组织主管 (org_orgmanager / nc.vo.org.OrgManagerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgmanager | 组织主管主键 | pk_orgmanager | varchar(50) | √ | 字符串 (String) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | cuserid | 用户 | cuserid | varchar(20) |  | 用户 (user) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |