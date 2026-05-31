# |<<

**薪资发放项目 (wa_classitem / nc.vo.wa.classitem.WaClassItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_classitem | 薪资发放项目主键 | pk_wa_classitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_class | 薪资类别 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 3 | cyear | 薪资年度 | cyear | varchar(50) |  | 字符串 (String) |
| 4 | cperiod | 薪资期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 5 | pk_wa_item | 公共项目名称 | pk_wa_item | varchar(20) |  | 公共薪资项目 (waitem) |
| 6 | itemkey | 公共薪资项目键值 | itemkey | varchar(50) |  | 字符串 (String) |
| 7 | name | 发放项目名称 | name | varchar(100) |  | 多语文本 (MultiLangText) |
| 8 | ifromflag | 数据来源 | ifromflag | int |  | 数据来源 (fromenum) |  | 0=由公式计算; |