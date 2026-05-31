# |<<

**指标库 (tpf_Indicatorlibrary / nc.vo.tmpf.indicatorlibrary.IndicatorlibraryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5823.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indicatorlibrary | 指标库主键 | pk_indicatorlibrary | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | cashflow | 现金流向 | cashflow | varchar(50) |  | 现金流向 (CashflowEnum) |  | 0=流入; |