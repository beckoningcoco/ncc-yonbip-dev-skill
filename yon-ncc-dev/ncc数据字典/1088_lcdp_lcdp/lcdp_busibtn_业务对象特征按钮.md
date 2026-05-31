# |<<

**业务对象特征按钮 (lcdp_busibtn / nc.vo.lcdp.pub.feature.BusiBtnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3543.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btn | 按钮主键 | pk_btn | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | parentbtncode | 父按钮编码 | parentbtncode | varchar(50) |  | 字符串 (String) |
| 5 | btncolor | 按钮颜色 | btncolor | varchar(50) |  | 按钮颜色 (lcdp_type_btncolor) |  | button_main=主要按钮; |