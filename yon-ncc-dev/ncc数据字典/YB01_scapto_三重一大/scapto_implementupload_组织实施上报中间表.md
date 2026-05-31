# |<<

**组织实施上报中间表 (scapto_implementupload / nc.vo.scapto.implementmanage.implementreport.implementupload.ImplementUploadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | execution_id | 组织实施标识 | execution_id | char(20) | √ | 主键 (UFID) |
| 2 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |