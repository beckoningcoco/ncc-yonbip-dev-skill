# |<<

**组织结构_业务汇报关系成员 (org_brsmember / nc.vo.corg.BusiReportStruMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4016.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_brsmember | 业务汇报关系成员主键 | pk_brsmember | char(20) | √ | 主键 (UFID) |
| 2 | pk_brs | 业务汇报关系主键 | pk_brs | varchar(20) | √ | 组织结构_业务汇报关系 (busireportstru) |
| 3 | membertype | 成员类型 | membertype | int | √ | 业务汇报关系成员类型 (membertypeenum) |  | 1=人员; |