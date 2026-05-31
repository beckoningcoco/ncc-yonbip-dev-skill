# |<<

**文档版本 (sm_document_version / nc.document.pub.vo.FileVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 主键 | pk_version | varchar(50) | √ | 字符串 (String) |
| 2 | versionno | 版本号 | versionno | smallint |  | 整数 (Integer) |
| 3 | realpath | 存储路径 | realpath | varchar(500) |  | 字符串 (String) |
| 4 | filelength | 文件大小 | filelength | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | createtime | 上传时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | filename | 真实名称 | filename | varchar(50) |  | 字符串 (String) |
| 7 | pk_file | 文档主键 | pk_file | varchar(50) |  | 字符串 (String) |
| 8 | creator | 上传人 | creator | varchar(36) |  | 用户 (user) |