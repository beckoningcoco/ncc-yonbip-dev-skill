# |<<

**费用单据扩展配置 (er_extendconfig / nc.vo.erm.extendconfig.ErmExtendConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1897.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_extendconfig | 唯一标识 | pk_extendconfig | varchar(50) | √ | 字符串 (String) |
| 2 | busi_tabcode | 业务页签编码 | busi_tabcode | varchar(50) | √ | 字符串 (String) |
| 3 | busi_tabname | 业务页签名称 | busi_tabname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | cardclass | 卡片实现类 | cardclass | varchar(200) |  | 字符串 (String) |
| 5 | listclass | 列表实现类 | listclass | varchar(200) |  | 字符串 (String) |
| 6 | queryclass | 查询实现类 | queryclass | varchar(200) |  | 字符串 (String) |
| 7 | busi_sys | 业务系统 | busi_sys | varchar(50) | √ | 字符串 (String) |
| 8 | cardlistenerclass | 卡片事件监听器 | cardlistenerclass | varchar(110) |  | 字符串 (String) |
| 9 | listlistenerclass | 列表事件监听器 | listlistenerclass | varchar(110) |  | 字符串 (String) |
| 10 | busitype | 费用单据业务类型 | busitype | int | √ | 整数 (Integer) | 0 |
| 11 | pk_tradetype | 费用单据交易类型 | pk_tradetype | varchar(50) | √ | 字符串 (String) |
| 12 | pk_billtype | 费用单据单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 13 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | metadataclass | 元数据路径 | metadataclass | varchar(100) |  | 字符串 (String) |