# |<<

**消耗汇总规则表体汇总单据范围 (ic_vmirule_bbr / nc.vo.ic.vmirule.entity.VmiRuleBodyBillRangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3008.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillrangeid | 表体汇总单据范围主键 | cbillrangeid | char(20) | √ | 主键 (UFID) |
| 2 | cbilltypeid | 单据类型 | cbilltypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | ctranstypeid | 交易类型 | ctranstypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |