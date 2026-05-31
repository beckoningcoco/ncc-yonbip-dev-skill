# |<<

**uif2页签扩展实体 (uap_uitabext / nc.vo.bd.uitabextend.UITabExtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5849.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_uitabextend | 主键 | pk_uitabextend | char(20) | √ | 主键 (UFID) |
| 2 | metadataid | 对应元实体ID | metadataid | varchar(36) |  | 字符串 (String) |
| 3 | exbean_name | 插件Bean名称 | exbean_name | varchar(200) |  | 字符串 (String) |
| 4 | ex_configpath | 扩展配置文件路径 | ex_configpath | varchar(400) |  | 字符串 (String) |
| 5 | ex_pointno | 扩展顺序号 | ex_pointno | int |  | 整数 (Integer) |
| 6 | nodekey | 单据模板标识 | nodekey | varchar(200) |  | 字符串 (String) |