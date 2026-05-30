# |<<

**打印方案明细 (qc_printscheme_b / nc.vo.qc.printscheme.entity.PrintSchemeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4851.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printscheme_b | 打印方案明细 | pk_printscheme_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心（OID） | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | pk_checkitem | 检验项目 | pk_checkitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 6 | iprintorder | 打印顺序 | iprintorder | int |  | 整数 (Integer) |
| 7 | bprint | 打印 | bprint | char(1) |  | 布尔类型 (UFBoolean) |