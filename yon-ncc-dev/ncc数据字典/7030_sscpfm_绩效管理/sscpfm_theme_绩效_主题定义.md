# |<<

**绩效_主题定义 (sscpfm_theme / nc.vo.sscpfm.basic.PFMThemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5587.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar(36) | √ | 字符串 (String) |
| 2 | name | 主题名字 | name | varchar(50) |  | 字符串 (String) |
| 3 | displaycolor | 前端展示颜色 | displaycolor | varchar(20) |  | 字符串 (String) |
| 4 | config | 主题配置信息 | config | text(0) |  | BLOB (BLOB) |
| 5 | bgimage | 背景图片 | bgimage | varchar(511) |  | 字符串 (String) |
| 6 | showorder | 排序 | showorder | int |  | 整数 (Integer) |
| 7 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |