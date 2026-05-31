# |<<

**组织结构_行政组织体系成员版本信息 (org_aosmember_v / nc.vo.om.aos.AOSMemberVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mvid | 行政组织体系成员版本主键 | pk_mvid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_fatherorg | 上级组织主键 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 5 | pk_orgvid | 组织版本主键 | pk_orgvid | varchar(20) |  | 组织_版本信息 (org_v) |