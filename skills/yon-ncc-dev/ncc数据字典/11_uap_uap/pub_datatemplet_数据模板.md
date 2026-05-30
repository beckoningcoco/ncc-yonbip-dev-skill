# |<<

**数据模板 (pub_datatemplet / nc.vo.pub.datatemplet.DataTempletVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4723.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatemplet_id | pk_datatemplet_id | pk_datatemplet_id | char(20) | √ | 主键 (UFID) |
| 2 | user_pk | 当前用户主键 | user_pk | char(20) | √ | 主键 (UFID) |
| 3 | fun_code | 当前功能节点编码 | fun_code | char(20) | √ | 主键 (UFID) |
| 4 | templet_name | 模板名称 | templet_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | templetdata | 模板数据 | templetdata | image |  | 图片类型 (IMAGE) |
| 6 | isdefault | 是否为默认 | isdefault | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | bill_ts | 单据模板时间 | bill_ts | varchar(100) | √ | 字符串 (String) |
| 8 | templet_order | 排列顺序 | templet_order | int | √ | 整数 (Integer) |
| 9 | extend1 | 扩展字段1 | extend1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | extend2 | 扩展字段2 | extend2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | extend3 | 扩展字段3 | extend3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | extend4 | 扩展字段4 | extend4 | varchar(101) |  | 自定义项 (Custom) |