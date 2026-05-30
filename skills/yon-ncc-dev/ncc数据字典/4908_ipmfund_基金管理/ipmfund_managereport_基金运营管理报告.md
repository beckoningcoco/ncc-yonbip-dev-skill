# |<<

**基金运营管理报告 (ipmfund_managereport / nc.vo.ipmfund.managereport.ManageReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_managereport | 基金运营管理报告主键 | pk_managereport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 报告编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | vbillname | 报告名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 7 | vyear | 报告年度 | vyear | varchar(20) |  | 字符串 (String) |
| 8 | reporttype | 报告类型 | reporttype | varchar(50) |  | 基金管理-报告类型 (ManageReportEnum) |  | 1=年报; |