# |<<

**上传文件信息 (iufo_jiuqi_file / nc.vo.iufo.jiuqi.NetUpFileInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3463.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_file_info | 文件信息主键 | pk_file_info | char(20) | √ | 主键 (UFID) |
| 2 | file_name | 文件名称 | file_name | varchar(64) | √ | 字符串 (String) |
| 3 | file_type | 文件类型 | file_type | int |  | 对照关系类型 (netmaptype) | 0 | 1=单位关系对照; |