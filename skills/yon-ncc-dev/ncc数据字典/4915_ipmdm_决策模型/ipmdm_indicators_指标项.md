# |<<

**指标项 (ipmdm_indicators / nc.vo.ipmdm.indicators.IndicatorsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3245.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indicators | 指标项主键 | pk_indicators | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | enablestate | 启用标记 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | innercode | 内部编码 | innercode | varchar(60) |  | 字符串 (String) |
| 9 | vmemo | 指标描述 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 10 | indicatorstype | 指标类型 | indicatorstype | varchar(50) |  | 指标类型 (IndicatorsType) |  | 1=加分指标; |