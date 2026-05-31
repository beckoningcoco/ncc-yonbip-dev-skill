# |<<

**传输资源 (adp_transres / nc.vo.uap.distribution.restrans.TransResourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/35.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | transresid | 编号 | transresid | char(20) | √ | 主键 (UFID) |
| 2 | transresourcecode | 资源编码 | transresourcecode | varchar(50) | √ | 字符串 (String) |
| 3 | restypeid | 资源类型 | restypeid | varchar(20) | √ | 传输资源注册信息 (resourcetyperegister) |
| 4 | senderid | 发送方系统编号 | senderid | varchar(20) | √ | 分布系统目录 (syscatalog) |
| 5 | receiverid | 接收方系统编号 | receiverid | varchar(20) | √ | 分布系统目录 (syscatalog) |
| 6 | creationtype | 生成方式 | creationtype | int | √ | 传输资源生成方式 (TransResCreationType) |  | 1=发送; |