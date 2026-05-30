# |<<

**科目关联信息历史 (bd_accasoahistory / nc.vo.bd.account.history.AccAsoaHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/295.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accasoahistory | 主键 | pk_accasoahistory | char(40) | √ | 主键 (UFID) |
| 2 | pk_accasoa | 科目关联表主键 | pk_accasoa | char(20) | √ | 会计科目 (accasoa) |
| 3 | pk_account | 科目主键 | pk_account | varchar(20) |  | 会计科目基本信息 (account) |
| 4 | pk_accchart | 所属科目表 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 5 | endflag | 末级标志 | endflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | ctrlmodules | 受控模块 | ctrlmodules | varchar(500) |  | 字符串 (String) |
| 7 | dispname | 科目显示名称 | dispname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | allowclose | 提前关账 | allowclose | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |