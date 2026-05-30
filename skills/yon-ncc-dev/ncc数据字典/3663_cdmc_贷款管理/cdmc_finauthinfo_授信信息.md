# |<<

**授信信息 (cdmc_finauthinfo / nc.vo.cdmc.cdm.financepay.FinAuthInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1375.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccinfo_b | 主键 | pk_ccinfo_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | ccprotocolid | 授信协议 | ccprotocolid | varchar(20) |  | 银行授信协议 (bankprotocol) |
| 4 | creditbankid | 授信银行 | creditbankid | varchar(20) |  | 银行档案 (bankdoc) |
| 5 | cccurrtypeid | 授信币种 | cccurrtypeid | varchar(20) |  | 币种 (currtype) |
| 6 | cctypeid | 授信类别 | cctypeid | varchar(20) |  | 授信类别 (tmpub_cctype) |
| 7 | authtype | 授信类型 | authtype | varchar(50) |  | 授信类型 (AuthTypeEnum) |  | GROUP=集团授信; |