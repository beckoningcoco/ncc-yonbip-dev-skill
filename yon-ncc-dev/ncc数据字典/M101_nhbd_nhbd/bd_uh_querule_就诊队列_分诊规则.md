# |<<

**就诊队列_分诊规则 (bd_uh_querule / com.yonyou.yh.nhis.bd.pvquerule.vo.PvQueRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1100.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvquerule | 就诊队列规则主键 | pk_pvquerule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | eu_queruletype | 分诊规则类型 | eu_queruletype | varchar(50) |  | 分针规则类型 (QueruleTypeEnum) |  | 0=参数规则; |