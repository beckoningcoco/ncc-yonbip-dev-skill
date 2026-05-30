# |<<

**入职材料接收 (hi_entry_material / nccloud.dto.hryf.entrymng.EntryMaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2541.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entry_material | 入职材料接收主键 | pk_entry_material | char(20) | √ | 主键 (UFID) |
| 2 | receivedate | 接收日期 | receivedate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 3 | deadline | 接收最后期限 | deadline | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | isreceive | 接收 | isreceive | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | uncommit | 缺件 | uncommit | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | memo | 备注 | memo | varchar(300) |  | 备注 (Memo) |
| 7 | pk_entryapply | 入职单主键 | pk_entryapply | char(20) |  | 主键 (UFID) |
| 8 | pk_material | 入职材料 | pk_material | varchar(20) |  | 入职材料(自定义档案) (Defdoc-HRYF001_0xx) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |