# |<<

**执行过程 (ct_pu_exec / nc.vo.ct.purdaily.entity.CtPuExecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1668.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_pu_exec | 执行过程主键 | pk_ct_pu_exec | char(20) | √ | 主键 (UFID) |
| 2 | vexecflow | 执行流程 | vexecflow | varchar(50) |  | 字符串 (String) |
| 3 | vexecdate | 日期 | vexecdate | varchar(19) |  | 日期 (UFDate) |
| 4 | vexecreason | 原因 | vexecreason | varchar(181) |  | 字符串 (String) |
| 5 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 6 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |