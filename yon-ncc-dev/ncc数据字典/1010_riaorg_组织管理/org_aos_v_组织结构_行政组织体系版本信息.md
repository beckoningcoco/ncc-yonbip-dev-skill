# |<<

**组织结构_行政组织体系版本信息 (org_aos_v / nc.vo.om.aos.AOSVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3992.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | vname | 版本名称 | vname | varchar(50) |  | 字符串 (String) |
| 5 | vno | 版本号 | vno | varchar(50) |  | 字符串 (String) |
| 6 | vstartdate | 版本生效日期 | vstartdate | char(19) |  | 日期时间 (UFDateTime) |
| 7 | venddate | 版本失效日期 | venddate | char(19) |  | 日期时间 (UFDateTime) |