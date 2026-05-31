# |<<

**项目结项单 (pm_projectfinish / nc.vo.ppm.projectfinish.ProjectFinishHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4512.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectfinish | 项目结项主键 | pk_projectfinish | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 单据号 | bill_code | varchar(40) |  | 字符串 (String) |
| 3 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 4 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 5 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | finishtype | 结项类型 | finishtype | int |  | 结项类型 (finishtype) |  | 1=正常结项; |