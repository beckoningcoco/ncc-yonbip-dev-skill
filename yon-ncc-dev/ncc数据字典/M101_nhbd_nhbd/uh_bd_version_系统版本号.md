# |<<

**系统版本号 (uh_bd_version / com.yonyou.yh.nhis.bd.tpi.ver.vo.VersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5918.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ver | 版本主键 | pk_ver | char(20) | √ | 主键 (UFID) |
| 2 | vernote | 版本说明 | vernote | varchar(50) |  | 字符串 (String) |
| 3 | version | 版本内容 | version | varchar(400) |  | 字符串 (String) |
| 4 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |