# |<<

**条形码字典 (ic_barcodedict_h / nc.vo.ic.barcodedict.BarCodeDictHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2883.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbcdictid | 条码规则字典主表主键 | cbcdictid | char(20) | √ | 主键 (UFID) |
| 2 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 3 | vbcdictcode | 字典编码 | vbcdictcode | varchar(30) |  | 字符串 (String) |
| 4 | vbcdictname | 字典名称 | vbcdictname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vbusiobj | 业务对象档案 | vbusiobj | varchar(50) | √ | 业务对象档案 (BarCodeDictObjectDocEnum) |  | bd_material=物料档案; |