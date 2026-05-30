# |<<

**BQ第三方插件文件 (bi_bqthirdpartyplugin_file / uap.bq.bqthirdpartyplugin.vo.BQThirdPartyPluginFileVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 主键 | pk | char(20) | √ | 主键 (UFID) |
| 2 | code | 插件编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | path | 文件路径 | path | varchar(500) |  | 字符串 (String) |
| 4 | content | 文件内容 | content | image |  | BLOB (BLOB) |