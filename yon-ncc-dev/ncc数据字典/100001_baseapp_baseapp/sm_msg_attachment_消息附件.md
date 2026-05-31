# |<<

**消息附件 (sm_msg_attachment / nc.message.vo.AttachmentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attachment | 主键 | pk_attachment | char(20) | √ | 主键 (UFID) |
| 2 | pk_message | 消息实体PK | pk_message | varchar(36) |  | 消息发送实体 (message) |
| 3 | pk_file | 文档地址pk | pk_file | varchar(36) |  | 文档信息表 (document_file) |
| 4 | filename | 文件名称 | filename | varchar(50) |  | 字符串 (String) |
| 5 | filesize | 文件大小 | filesize | int |  | 整数 (Integer) |