# |<<

**收入政策匹配规则 (firm_policyrule / nc.vo.rm.policyrule.PolicyRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2283.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_policyrule | 主键 | pk_policyrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | contracttype | 收入合同类型 | contracttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | martype | 物料分类 | martype | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | fsalemode | 销售渠道 | fsalemode | varchar(20) |  | 渠道类型 (channeltype) |
| 9 | giveawayflag | 赠品 | giveawayflag | varchar(50) |  | 赠品的收入确认规则 (giveaway) |  | Y=是; |