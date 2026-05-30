# |<<

**项目登记 (pm_projectregister / nc.vo.phm.projectregister.ProjectRegisterHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4515.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectregister | 项目登记主键 | pk_projectregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 4 | bill_code | 单据号 | bill_code | varchar(40) |  | 字符串 (String) |
| 5 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |