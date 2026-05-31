# |<<

**传输资源注册信息 (adp_restypregister / nc.vo.uap.distribution.restype.ResourceTypeRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/25.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | restypeid | 主键 | restypeid | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | createpkgeditor | 消息创建节点 | createpkgeditor | varchar(20) |  | 功能实体 (functionEntity) |
| 5 | pkgeditor | 资源包查看节点 | pkgeditor | varchar(20) |  | 功能实体 (functionEntity) |
| 6 | viewreceipteditor | 回执查看节点 | viewreceipteditor | varchar(20) |  | 功能实体 (functionEntity) |
| 7 | createpkgclass | 后台资源创建类 | createpkgclass | varchar(500) |  | 字符串 (String) |
| 8 | serverpkgclass | 后台消息处理类 | serverpkgclass | varchar(500) |  | 字符串 (String) |
| 9 | receiptclass | 回执消息处理类 | receiptclass | varchar(500) |  | 字符串 (String) |
| 10 | unloaderclass | 数据卸载处理类 | unloaderclass | varchar(500) |  | 字符串 (String) |
| 11 | createtranseditor | 传输内容自定义生成面板 | createtranseditor | varchar(500) |  | 内容面板枚举 (createtranseditorenum) | nc.ui.uap.distribution.schedtranstask.DefaultTaskTransContentUI | nc.ui.uap.distribution.schedtranstask.DefaultQueryTemplateTransContentUI=通用查询模板; |