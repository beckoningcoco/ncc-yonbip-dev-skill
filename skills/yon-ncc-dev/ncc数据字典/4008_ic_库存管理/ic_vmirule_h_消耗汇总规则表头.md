# |<<

**消耗汇总规则表头 (ic_vmirule_h / nc.vo.ic.vmirule.entity.VmiRuleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvmirulehid | 消耗汇总规则主表主键 | cvmirulehid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(0) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | vmicode | 消耗汇总规则编码 | vmicode | varchar(20) |  | 字符串 (String) |
| 4 | vminame | 消耗汇总规则名称 | vminame | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vmimatchpurinrule | 消耗匹配采购入库的规则 | vmimatchpurinrule | varchar(20) |  | 消耗匹配采购入库的规则 (VmiMatchPurinRuleFlg) | 1 | 1=匹配出库组织采购入库单; |