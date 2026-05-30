# |<<

**组织实施数据写入中间表 (scapto_implementwrite / nc.vo.scapto.implement.write.ImplementWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5141.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_implementwrite | 组织实施数据写入中间表主键 | pk_implementwrite | char(20) | √ | 主键 (UFID) |
| 2 | execution_id | 组织实施标识 | execution_id | varchar(50) | √ | 字符串 (String) |
| 3 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |