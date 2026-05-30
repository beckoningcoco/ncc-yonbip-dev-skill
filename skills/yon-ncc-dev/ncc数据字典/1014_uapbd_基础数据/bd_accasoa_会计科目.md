# |<<

**会计科目 (bd_accasoa / nc.vo.bd.account.AccAsoaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/294.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accasoa | 主键 | pk_accasoa | char(20) | √ | 主键 (UFID) |
| 2 | pk_account | 科目主键 | pk_account | char(20) | √ | 会计科目基本信息 (account) |
| 3 | pk_accchart | 所属科目表 | pk_accchart | char(20) | √ | 科目表 (accchart) |
| 4 | endflag | 末级标志 | endflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 5 | ctrlmodules | 受控模块 | ctrlmodules | varchar(500) |  | 字符串 (String) |
| 6 | dispname | 科目显示名称 | dispname | varchar(1000) |  | 多语文本 (MultiLangText) |
| 7 | allowclose | 提前关账 | allowclose | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |