# |<<

**执行过程 (fct_ap_exec / nc.vo.fct.ap.entity.CtApExecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2168.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fct_ap_exec | 执行过程主键 | pk_fct_ap_exec | char(20) | √ | 主键 (UFID) |
| 2 | vexecflow | 执行流程 | vexecflow | varchar(50) |  | 字符串 (String) |
| 3 | vexecdate | 执行时间 | vexecdate | char(19) |  | 日期 (UFDate) |
| 4 | vexecreason | 原因 | vexecreason | varchar(181) |  | 字符串 (String) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |