# |<<

**取样单检验项目表 (qc_samplebill_bb / nc.vo.qc.c007.entity.SamplingCheckItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4863.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_samplebill_bb | 取样单子子表主键 | pk_samplebill_bb | char(20) | √ | 主键 (UFID) |
| 2 | crownobb | 行号 | crownobb | varchar(20) |  | 字符串 (String) |
| 3 | pk_checkitem | 检验项目编码 | pk_checkitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 4 | nsampastnumbb | 样本量 | nsampastnumbb | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nacnum | 接受数 | nacnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nrenum | 拒收数 | nrenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pk_chkcenter | 检测中心最新版本 | pk_chkcenter | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 8 | pk_chkcenter_v | 检测中心 | pk_chkcenter_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 9 | pk_outsupplier | 外部检测机构 | pk_outsupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | pk_bcheckmode | 取样方式 | pk_bcheckmode | varchar(20) |  | 取样方式 (qc_checkmode) |
| 11 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 13 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 14 | pk_samplebill | 取样单主表id | pk_samplebill | char(20) |  | 主键 (UFID) |
| 15 | cunitidbb | 主单位 | cunitidbb | varchar(20) |  | 计量单位 (measdoc) |