# |<<

**条码规则定义 (bcbd_barcoderuleitem / nc.vo.bcbd.barcoderule.BarCodeRuleItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/261.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barruleitem | 条码规则定义主键 | pk_barruleitem | char(20) | √ | 主键 (UFID) |
| 2 | startpos | 起始位置 | startpos | int |  | 整数 (Integer) |
| 3 | length | 长度 | length | int |  | 整数 (Integer) |
| 4 | pk_appobjattr | 条码对象属性 | pk_appobjattr | varchar(20) |  | 条码应用对象属性 (barappobject_item) |
| 5 | appobjattrvalue | 条码对象属性值 | appobjattrvalue | varchar(100) |  | 字符串 (String) |
| 6 | formate | 数据格式 | formate | varchar(50) |  | 字符串 (String) |
| 7 | isparseretrieve | 解析返回 | isparseretrieve | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 9 | accessstrategy | 取值策略 | accessstrategy | int |  | 取值策略 (accessstrategy) |  | 1=元数据; |