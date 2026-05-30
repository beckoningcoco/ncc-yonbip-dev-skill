# |<<

**质检报告 (qc_reportbill / nc.vo.qc.c003.entity.ReportHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4858.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportbill | 质检报告 | pk_reportbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillcode | 质检报告号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | pk_applybill | 报检单主键 | pk_applybill | varchar(20) |  | 主键 (UFID) |
| 7 | ctrantypeid | 报告类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vtrantypecode | 报告类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | fbillstatus | 单据状态 | fbillstatus | int |  | QC单据状态 (QCBillStatusEnum) |  | 0=自由; |