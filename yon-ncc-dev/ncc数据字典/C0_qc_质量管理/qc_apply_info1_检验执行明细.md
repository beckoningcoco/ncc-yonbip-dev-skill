# |<<

**检验执行明细 (qc_apply_info1 / nc.vo.qc.c001.entity.ApplyChkRunInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4820.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply_info1 | 检验单执行信息明细 | pk_apply_info1 | char(20) | √ | 主键 (UFID) |
| 2 | pk_applybill | 报检单主键 | pk_applybill | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 5 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 6 | pk_chkbatch | 检验批次 | pk_chkbatch | varchar(20) |  | 检验批次 (qc_chkbatch) |
| 7 | nchecknum | 本批次检验主数量 | nchecknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | icrtbill | 生成检验单个数 | icrtbill | int |  | 整数 (Integer) |
| 9 | icrtrebill | 生成复验检验单个数 | icrtrebill | int |  | 整数 (Integer) |
| 10 | iauditbill | 检验单审批个数 | iauditbill | int |  | 整数 (Integer) |
| 11 | icrtsample | 生成取样单的个数 | icrtsample | int |  | 整数 (Integer) |
| 12 | icrtresample | 复验生成取样单的个数 | icrtresample | int |  | 整数 (Integer) |
| 13 | iauditsample | 取样单审批个数 | iauditsample | int |  | 整数 (Integer) |
| 14 | ichkedsample | 已生成检验单的取样单个数 | ichkedsample | int |  | 整数 (Integer) |
| 15 | pk_reportbill | 已生成报告的主键 | pk_reportbill | varchar(20) |  | 主键 (UFID) |
| 16 | breportaudit | 报告是否已审批 | breportaudit | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | irptdownbill | 报告复验生成下游单据的个数 | irptdownbill | int |  | 整数 (Integer) |